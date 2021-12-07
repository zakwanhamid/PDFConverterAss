//selecting all required elements
const dropArea = document.querySelector(".upload-drag")

//If user Drag File over DragArea
dropArea.addEventListener("dragover", ()=>{
  console.log("File is over DragArea") ;
})

//If user leave Dragged File from DragArea
dropArea.addEventListener("dragleave", ()=>{
  console.log("File is outside from DragArea") ;
})