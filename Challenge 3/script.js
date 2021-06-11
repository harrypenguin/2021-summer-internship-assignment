function openOverlay1() {
  document.getElementById("overlay").style.visibility = "visible";
  console.log('1 clicked');
  document.getElementById("description").innerHTML = "Collaboration";
  document.getElementById("description").style.visibility = "visible";
  document.getElementById("overlayImage").src = 'GOA-Interview-Assets/surface-ZlJmOUFRBfQ-unsplash.jpg';
}

function openOverlay2() {
  document.getElementById("overlay").style.visibility = "visible";
  console.log('2 clicked');
  document.getElementById("description").innerHTML = "Mountain";
  document.getElementById("description").style.visibility = "visible";
  document.getElementById("overlayImage").src = 'GOA-Interview-Assets/sergey-pesterev-llGiAyYthDw-unsplash.jpg';
}

function openOverlay3() {
  document.getElementById("overlay").style.visibility = "visible";
  console.log('3 clicked');
  document.getElementById("description").innerHTML = "Ben";
  document.getElementById("description").style.visibility = "visible";
  document.getElementById("overlayImage").src = 'GOA-Interview-Assets/lee-chinyama-6lGiNbAublo-unsplash.jpg';
}

function openOverlay4() {
  document.getElementById("overlay").style.visibility = "visible";
  console.log('4 clicked');
  document.getElementById("description").innerHTML = "Triangle";
  document.getElementById("description").style.visibility = "visible";
  document.getElementById("overlayImage").src = 'GOA-Interview-Assets/simone-hutsch-8LwKILB2ceI-unsplash.jpg';
}

function closeNav() {
  document.getElementById("overlay").style.visibility = "hidden";
  document.getElementById("description").style.visibility = "hidden";
}