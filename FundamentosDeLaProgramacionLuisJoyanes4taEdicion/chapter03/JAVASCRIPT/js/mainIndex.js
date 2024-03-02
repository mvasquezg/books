function goToPage(){
    let myIndex=form.dest.selectedIndex;
    //window.open(form.dest.options[myIndex].value, "_top","&quot");
    //location.href=this.options[this.selectedIndex].value;
    location.href=this.options[myIndex].value;
}