package com.expresiones;

public class Main {
    public static void main(String[] args) {

        int[][] arraysbreak={
            { 32,   87,    3, 589},
            {12, 1076, 2000,   8},
            { 622,  127,   77, 955 }
        };   
    
        int buscarNumero = 12;
        int i;
        int j=0;
        boolean encontrado=false;

        buscar:
        for(i=0; i<arraysbreak.length;i++){
            for (j=0 ; j < arraysbreak[i].length; j++) {
                if(arraysbreak[i][j]== buscarNumero){
                    encontrado= true;
                    break buscar;
            }
       }
    
    }
    if(encontrado){
        System.out.println("se encontro "+buscarNumero+" en la matriz en posicion "+i+ " - "+j);

    }else{
        System.out.println("no se encontro el numero");
    }

}

}

