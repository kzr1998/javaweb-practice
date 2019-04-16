function show() {
    var yyyy=document.getElementById("yyyy");
    var mm=document.getElementById("mm");
    var dd=document.getElementById("dd");
    var date=new Date();
    var year=parseInt(date.getFullYear());
      initSelect(yyyy,1999,year);
      initSelect(mm,1,12);
      initSelect(dd,1,31);
      var n=yyyy.length;
      yyyy.selectedIndex=Math.round(n/2);
    /*for(var i=1999;i<=year;i++){
        yyyy.options.add(new Option(i,i));
    }
    for(var i=1;i<=12;i++){
        mm.options.add(new Option(i,i));
    }
    for(var i=1;i<=31;i++){
        dd.options.add(new Option(i,i));
    }*/
}
/* 给列表框复制，传递三个参数：表单元素，开始值，结束值*/
function initSelect(obj,start,end) {
     for(var i=start;i<=end;i++){
         obj.options.add(new Option(i,i));
     }
}
function selectShow() {
    var mm=document.getElementById("mm");
    var dd=document.getElementById("dd");
    var m=parseInt(mm.value);
    var dayend;
    if(m==4||m==6||m==9||m==11){
        dayend=30;
    }else if(m==2){
        dayend=28;
        y=parseInt(yyyy.value);
        if((y%4==0&&y%100!=0)||y%400==0){
            dayend=29;
        }
    }else {
        dayend=31;
    }
    dd.options.length=0;
    initSelect(dd,1,dayend);
}
function deleteSelect() {
    var dd=document.getElementById("dd");
    for(var i=0;i<dd.length;i++){
        dd.options.remove(1);
    }
}