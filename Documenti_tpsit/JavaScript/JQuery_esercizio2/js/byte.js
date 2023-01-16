$(document).ready( function() {

   function ricalcola()
   {
      d=0;
      for(i=z-1;i>=0;i--)
      {
         v=$("#d"+i).attr('valore');
         d=d+Math.pow(2,i)*v;
      }
      return(d);
   }

   deci=0;
   nuovo = document.createElement('div');
   nuovo.setAttribute('id', 'decimale');
   $("body").append(nuovo);
   $("#decimale").html(deci);

   z=8;
   for(i=z-1;i>=0;i--)
   {

      nuovo = document.createElement('div');
      nuovo.setAttribute('id', 'd'+i);
      nuovo.setAttribute('class', 'miediv');
      nuovo.setAttribute('valore', 0);
      $("body").append(nuovo);

      l=420-(i*55);

      $("#d"+i).attr('valore',0);
      $("#d"+i).html(i);
      $("#d"+i).css({
         'left':l
      });

      $("#d"+i).click( function() {
          
          v=$(this).attr('valore');
          if(v==0)
          {  
             v=1;
             co='rgb(255,0,0)'; 
          }
          else
          {  
             v=0;
             co='rgb(0,0,0)'; 
          }
          $(this).attr('valore',v);
          $(this).css({ 
             'top':10+(60*v),
             'background-color':co  
          });
          
          deci=ricalcola();
          $("#decimale").html(deci);
      });

   }
});   

