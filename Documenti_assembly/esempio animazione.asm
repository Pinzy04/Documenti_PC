org 100h

;posiziono il cursore nel mezzo sulla prima riga
          mov dh, 00h
ciclo:    mov ax, 0003h
          int 10h
;pulisco lo schermo    
;posiziono la colonna
    mov dl, 15h
    mov ah, 02h
    int 10h
;4 metto a video un carattere   
    mov al,'O'                                                                              
    mov ah, 0Eh  
    int 10h
;aspetto un tempo x    
            mov cx, 00009h
ritardo:    nop
            loop ritardo   
            
            inc dh
            cmp dh, 20h
            jb ciclo 
            
            mov ax, 0003h
            int 10h 
            
;se viene premuto un tasto salto al punto 5
;5 ontrollo se il tasto premuto e' ESC  
        mov ah, 00h
        int 16h
        cmp al, 20h
        je bravo
bravo:  mov dx, offset msg1
        mov ah, 9
        int 21h
;se e' vero termino
;altrimenti incremento la riga e torno al punto di visualizzazione(4)   
   
ret  

msg1 db "bravo $"