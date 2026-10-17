'use strict';
const problems=[{"y":2023,"title":"Restaurant Cipher","slug":"restaurant-cipher","topic":"Strings","level":"Archive review","desc":"Explore character frequencies and use counting to interpret encoded text."},{"y":2023,"title":"Happy Numbers","slug":"happy-numbers","topic":"Number theory","level":"Archive review","desc":"Track digit-square sums and count numbers that eventually reach one."},{"y":2023,"title":"Caesar Redux","slug":"caesar-redux","topic":"Strings","level":"Archive review","desc":"Work with Caesar shifting, wraparound, and string transformations."},{"y":2024,"title":"Stick","slug":"stick","topic":"Geometry","level":"Source linked","desc":"Compute the covered area of overlapping squares using an exact formula."},{"y":2024,"title":"Two Fridges","slug":"two-fridges","topic":"Intervals","level":"Practice verified","desc":"Select two temperature settings that satisfy every allowed interval."},{"y":2024,"title":"King's Order","slug":"kings-order","topic":"Graphs","level":"Archive review","desc":"Construct a valid prerequisite ordering using a priority queue."},{"y":2025,"title":"The Twin Occurrence Quest","slug":"twin-occurrence-quest","topic":"Binary search","level":"Archive linked","desc":"Find first and last occurrences in a sorted array efficiently."},{"y":2025,"title":"Magic Wands","slug":"magic-wands","topic":"Greedy","level":"Archive linked","desc":"Find the minimum number of fixed-length flips to reach the target state."},{"y":2025,"title":"Raju's Matrix Runs","slug":"rajus-matrix-runs","topic":"Graph DP","level":"Archive discrepancy","desc":"Find the longest strictly increasing four-directional grid path."}];
let year='all';
let search='';
const root='https://github.com/kayaniyasir/IEEE2026/blob/main/';
const cards=document.querySelector('#cards'),empty=document.querySelector('#empty');
function render(){
  cards.replaceChildren();
  let matches=problems.filter(p=>(year==='all'||String(p.y)===year)&&[p.title,p.topic,p.desc,String(p.y)].join(' ').toLowerCase().includes(search));
  for(const p of matches){
    const article=document.createElement('article');article.className='card';
    const top=document.createElement('div');top.className='card-top';
    const date=document.createElement('span');date.className='year';date.textContent='IEEEXtreme '+(p.y-2006)+'.0 · '+p.y;
    const source=document.createElement('span');source.className='source';source.textContent=p.level;
    top.append(date,source);
    const title=document.createElement('h3');title.textContent=p.title;
    const desc=document.createElement('p');desc.textContent=p.desc;
    const topic=document.createElement('div');topic.className='topic';topic.textContent=p.topic;
    const link=document.createElement('a');link.href=root+p.y+'/'+p.slug+'/README.md';link.textContent='Open learning folder →';link.target='_blank';link.rel='noopener noreferrer';
    article.append(top,title,desc,topic,link);cards.append(article);
  }
  empty.hidden=matches.length!==0;
}
document.querySelectorAll('[data-year]').forEach(btn=>btn.addEventListener('click',()=>{
 year=btn.dataset.year;
 document.querySelectorAll('[data-year]').forEach(b=>{const active=b===btn;b.classList.toggle('active',active);b.setAttribute('aria-pressed',active?'true':'false')});
 render();
}));
document.querySelector('#search').addEventListener('input',e=>{search=e.target.value.trim().toLowerCase();render()});
render();
