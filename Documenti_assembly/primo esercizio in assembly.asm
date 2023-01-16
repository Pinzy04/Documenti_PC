name "Scrivo un carattere"

org 100h


;scrive messaggio a video
mov dx, offset msg1
mov ah, 9
int 21h 

;prendere un carattere da tastiera

mov ah, 1  ;modalita' stringa
int 21h  

mov ah, 2  ;modalia' carattere
mov dl, 0ah   ;scendo di riga
int 21h

mov dl, 0dh   ;torno all'inizio di riga
int 21h  

mov bl,al  

;scrivere a video i bit
mov cx,8

print: mov ah, 2   ; print function.
       mov dl, '0'
       test bl, 10000000b  ; test first bit.
       jz zero
       mov dl, '1'
zero:  int 21h
       shl bl, 1
loop print
; print binary suffix:
mov dl, 'b'
int 21h



mov dl, 0ah ; new line.
int 21h
mov dl, 0dh ; carrige return.
int 21h   

ret

msg1 db "Scrivi un carattere:  $"