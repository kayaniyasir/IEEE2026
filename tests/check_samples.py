#!/usr/bin/env python3
"""Compile and test all IEEEXtreme Java learning solutions with the checked-in samples."""
from pathlib import Path
import subprocess
import sys

root=Path(__file__).resolve().parents[1]
problems=[('2023','restaurant-cipher'),('2023','happy-numbers'),('2023','caesar-redux'),
          ('2024','stick'),('2024','two-fridges'),('2024','kings-order'),
          ('2025','twin-occurrence-quest'),('2025','magic-wands'),('2025','rajus-matrix-runs')]
errors=[]
for year,slug in problems:
    folder=root/year/slug
    p=folder/'Main.java'
    assert p.is_file(), f"Missing {p}"
    compilation=subprocess.run(['javac','-encoding','UTF-8','Main.java'], cwd=folder, capture_output=True, text=True,timeout=35)
    if compilation.returncode:
        errors.append(f"{year}/{slug}: compilation failed: {compilation.stderr}")
        continue
    actual=subprocess.run(['java','Main'],cwd=folder,input=(folder/'sample.in').read_text(encoding='utf-8'),capture_output=True,text=True,timeout=35)
    expected=(folder/'sample.out').read_text(encoding='utf-8').replace('\r\n','\n').strip()
    if actual.returncode or actual.stdout.replace('\r\n','\n').strip()!=expected:
        errors.append(f"{year}/{slug}: sample mismatch or runtime error; expected={expected!r} actual={actual.stdout!r} stderr={actual.stderr!r}")
    else:
        print(f"PASS {year}/{slug}")
if errors:
    print("\n".join(errors),file=sys.stderr)
    sys.exit(1)
print("All nine Java solutions compiled and passed sample checks. This is not official contest judge acceptance.")
