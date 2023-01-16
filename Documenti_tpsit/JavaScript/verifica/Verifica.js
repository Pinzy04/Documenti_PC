$(document).ready( function() {

    scelta = document.createElement('div');
    scelta.setAttribute('id', "scelta")
    scelta.setAttribute('class', 'coloreScelto');
    scelta.setAttribute('colore', 'black');
    $("body").append(scelta);
    $("#scelta").css({'top':300 , 'left':500 });
    

    for(i=0;i<4;i++){
        scelta = document.createElement('div');
        scelta.setAttribute('id', "scelta"+i)
        scelta.setAttribute('class', 'coloreScelto'+i);
        //scelta.setAttribute('colore',colore);
        scelta.setAttribute('i', i);
        $("body").append(scelta);
        l=(i*75)+10;
        /*
        $("#scelta0").attr('colore','red');
        $("#scelta1").attr('colore','blue');
        $("#scelta2").attr('colore','green');
        $("#scelta3").attr('colore','yellow');
        questa parte crea problemi
        */
        $("#scelta"+i).css({'left':l });

        $("#scelta"+i).click( function() {
            $("#scelta").css({ 'background-color':colore });
        });
    }
    
    r=20;
    c=20;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            nuovo = document.createElement('div');
            nuovo.setAttribute('id', 'casella'+i+"-"+j);
            nuovo.setAttribute('class', 'box');
            //scelta.setAttribute('colore', colore);
            nuovo.setAttribute('i', i);
            nuovo.setAttribute('j', j);
            $("body").append(nuovo);
    
            t=(i*20)+180;
            l=(j*20)+10;
            $("#casella"+i+"-"+j).css({ 'top':t, 'left':l });
    
            $("#casella"+i+"-"+j).click( function() {
                $("#casella"+i+"-"+j).css({ 'background-color':colore });
            });
        }
    }
 
 });