function init() {
    var num=document.getElementById("num");
    num.value=0;
    num.disabled="disabled";
    var oButton=document.getElementsByTagName("input");
    for(var i=0;i<oButton.length;i++){
        oButton[i].onclick=function () {
            if(!isNumber(this.value)){
                num.value=(num.value+this.value)*1;
            }else {
                num.value=num.value
            }
        }
    }else{
        
    }

}
    function  isNull(n) {
        if(n*1==0||n.length==0){
            return true;
        }else {
            return false;
        }
    }
function isNumber(n) {
    return !isNaN(n);
}
// function num_1_click() {
//     var num=document.getElementById("num")
//      var n=num.value;
//     if(n=="0"){
//         n="1";
//     }else {
//         n=n+"1";
//     }
//     document.getElementById("num").value=n;
// }
