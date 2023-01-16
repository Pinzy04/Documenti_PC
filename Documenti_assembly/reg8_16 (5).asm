data segment 
    

ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
nop			
mov al,12h
mov ah,55h
add al,ah

mov al,97h
mov bl,24h
add al,bl

mov al,99h
mov bl,83h
add al,bl

mov ax,0099h
mov bx,0083h
add ax,bx 

push ax

xor ax,ax
not ax 

mov ax,0000h

mov ax,0fff0h
mov bx,4321h
and ax,bx 

push bx  

xchg ax,bx

pop bx
pop ax

mov ax,000fh
mov bx,1234h
or  ax,bx 

mov ax,4c00h
int 21h  

ends

end start
