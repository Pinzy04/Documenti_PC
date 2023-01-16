name "Macchinina"
org 100h
;set video mode
mov al, 03h
mov ah, 00h
int 10h
;primo pezzo del percorso        
          mov cx, 14h  
          mov dh, 00h ;riga 0 
          mov dl, 00h ;colonna 0
          mov ah, 02h
          int 10h
percorso1:mov al, 5Fh
          mov ah, 0Eh
          int 10h
          inc dl
          loop percorso1
;secondo pezzo del percorso          
          mov cx, 0Bh 
          mov dh, 01h ;riga 2
          mov dl, 14h ;colonna 20
percorso2:mov ah, 02h
          int 10h
          mov al, 7Ch
          mov ah, 0Eh
          int 10h
          inc dh
          loop percorso2
;terzo pezzo del percorso        
          mov cx, 20h  
          mov dh, 0Bh ;riga 11 
          mov dl, 15h ;colonna 21
          mov ah, 02h
          int 10h
percorso3:mov al, 5Fh
          mov ah, 0Eh
          int 10h
          inc dl
          loop percorso3
;quarto pezzo del percorso          
          mov cx, 0Bh 
          mov dh, 0Bh ;riga 11
          mov dl, 35h ;colonna 53
percorso4:mov ah, 02h
          int 10h
          mov al, 7Ch
          mov ah, 0Eh
          int 10h
          dec dh
          loop percorso4
;quinto pezzo del percorso        
          mov cx, 1Ah  
          mov dh, 00h ;riga 0 
          mov dl, 36h ;colonna 54
          mov ah, 02h
          int 10h
percorso5:mov al, 5Fh
          mov ah, 0Eh
          int 10h
          inc dl
          loop percorso5
;sesto pezzo del percorso        
          mov cx, 0Ah  
          mov dh, 05h ;riga 5 
          mov dl, 00h ;colonna 0
          mov ah, 02h
          int 10h
percorso6:mov al, 5Fh
          mov ah, 0Eh
          int 10h
          inc dl
          loop percorso6
          
;primo ostacolo
mov dh, 04h ;riga 4
mov dl, 0Eh ;colonna 14
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 04h ;riga 4
mov dl, 0Fh ;colonna 15
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 05h ;riga 5
mov dl, 0Eh ;colonna 14
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 05h ;riga 5
mov dl, 0Fh ;colonna 15
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

;settimo pezzo del percorso          
          mov cx, 10h 
          mov dh, 06h ;riga 6
          mov dl, 0Ah ;colonna 10
percorso7:mov ah, 02h
          int 10h
          mov al, 7Ch
          mov ah, 0Eh
          int 10h
          inc dh
          loop percorso7 

;secondo ostacolo
mov dh, 10h ;riga 16
mov dl, 10h ;colonna 16
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 10h ;riga 16
mov dl, 11h ;colonna 17
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 10h ;riga 16
mov dl, 12h ;colonna 18
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 11h ;riga 17
mov dl, 10h ;colonna 16
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 11h ;riga 17
mov dl, 11h ;colonna 17
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 11h ;riga 17
mov dl, 12h ;colonna 18
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 12h ;riga 18
mov dl, 10h ;colonna 16
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 12h ;riga 18
mov dl, 11h ;colonna 17
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 12h ;riga 18
mov dl, 12h ;colonna 18
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

;ottavo pezzo del percorso        
          mov cx, 37h  
          mov dh, 15h ;riga 22 
          mov dl, 0Bh ;colonna 11
          mov ah, 02h
          int 10h
percorso8:mov al, 5Fh
          mov ah, 0Eh
          int 10h
          inc dl
          loop percorso8

;terzo ostacolo
;parte 1
mov dh, 0Eh ;riga 14
mov dl, 23h ;colonna 35
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 0Eh ;riga 14
mov dl, 24h ;colonna 36
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 0Fh ;riga 15
mov dl, 23h ;colonna 35
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 0Fh ;riga 15
mov dl, 24h ;colonna 36
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

;parte 2
mov dh, 12h ;riga 18
mov dl, 28h ;colonna 40
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 12h ;riga 18
mov dl, 29h ;colonna 41
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 13h ;riga 19
mov dl, 28h ;colonna 40
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 13h ;riga 19
mov dl, 29h ;colonna 41
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

;parte 3
mov dh, 0Fh ;riga 15
mov dl, 2Dh ;colonna 45
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 0Fh ;riga 15
mov dl, 2Eh ;colonna 46
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 10h ;riga 16
mov dl, 2Dh ;colonna 45
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 10h ;riga 16
mov dl, 2Eh ;colonna 46
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

;parte 4
mov dh, 13h ;riga 19
mov dl, 32h ;colonna 50
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 13h ;riga 19
mov dl, 33h ;colonna 51
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 14h ;riga 20
mov dl, 32h ;colonna 50
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 14h ;riga 20
mov dl, 33h ;colonna 51
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

;parte 5
mov dh, 10h ;riga 16
mov dl, 37h ;colonna 55
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 10h ;riga 16
mov dl, 38h ;colonna 56
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 11h ;riga 17
mov dl, 37h ;colonna 55
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 11h ;riga 17
mov dl, 38h ;colonna 56
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

;parte 6
mov dh, 0Dh ;riga 13
mov dl, 3Dh ;colonna 61
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 0Dh ;riga 13
mov dl, 3Eh ;colonna 62
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 0Eh ;riga 14
mov dl, 3Dh ;colonna 61
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 0Eh ;riga 14
mov dl, 3Eh ;colonna 62
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

;nono pezzo del percorso          
          mov cx, 0Eh 
          mov dh, 15h ;riga 21
          mov dl, 42h ;colonna 66
percorso9:mov ah, 02h
          int 10h
          mov al, 7Ch
          mov ah, 0Eh
          int 10h
          dec dh
          loop percorso9

;quarto ostcolo
mov dh, 04h ;riga 4
mov dl, 40h ;colonna 64
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 04h ;riga 4
mov dl, 41h ;colonna 65
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h 

mov dh, 05h ;riga 5
mov dl, 40h ;colonna 64
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

mov dh, 05h ;riga 5
mov dl, 41h ;colonna 65
mov ah, 02h
int 10h
mov al, 2Ah
mov ah, 0Eh
int 10h

;decimo pezzo del percorso        
          mov cx, 0Dh  
          mov dh, 07h ;riga 7 
          mov dl, 43h ;colonna 65
          mov ah, 02h
          int 10h
percorsoA:mov al, 5Fh
          mov ah, 0Eh                                                             
          int 10h
          inc dl
          loop percorsoA
          
;macchina
input: mov dh, rigamacchinina           ;visualizza macchinina nella sua posizione
       mov dl, colonnamacchinina 
       mov ah, 02h
       int 10h
       mov al, 02h
       mov ah, 0Eh
       int 10h 

aspetta: mov ah, 00h      ;aspetta
         int 16h 
       
         cmp al, "w" 
         je moveup
       
         cmp al, "s" 
         je movedown
       
         cmp al, "d" 
         je moveright
       
         jmp aspetta
       

moveup: ;prima di spostarmi verifico se non sono sul bordo     se riga = 1 perdere
        cmp dh, 1
        je perdi
        mov dh, rigamacchinina          
        mov dl, colonnamacchinina 
        mov ah, 02h
        int 10h
        mov al, " "
        mov ah, 0Eh
        int 10h
        dec rigamacchinina  
        jmp input 

movedown: cmp dh, 04h
          je controllo1
continua: mov dh, rigamacchinina          
          mov dl, colonnamacchinina 
          mov ah, 02h
          int 10h
          mov al, " "
          mov ah, 0Eh
          int 10h
          inc rigamacchinina
          jmp input 
        
moveright: cmp dl, 13h
           je controllo2
continua2: cmp dl, 4Fh
           je vinci
           mov dh, rigamacchinina          
           mov dl, colonnamacchinina 
           mov ah, 02h
           int 10h
           mov al, " "
           mov ah, 0Eh
           int 10h      
           inc colonnamacchinina
           jmp input

perdi: mov dh, 07h
       mov dl, 20h
       mov ah, 02h
       int 10h
       mov dx, offset sconfitta
       mov ah, 9
       int 21h
       jmp fine

vinci: mov dh, 07h
       mov dl, 1Fh
       mov ah, 02h
       int 10h
       mov dx, offset vittoria
       mov ah, 9
       int 21h
       jmp fine

controllo1: cmp dl, 0Ah
            jb perdi 
            jmp continua 
            
controllo2: cmp dh, 0Ah
            jb perdi
            jmp continua2
            
       
fine: 
       
ret

rigamacchinina db 03h
colonnamacchinina db 01h       
sconfitta db "GAME  OVER $" 
vittoria  db "GG YOU WIN $"