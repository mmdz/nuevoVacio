
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */

        for (int i = 1; i <= dim; i++) {
            
            for (int j = 1; j <= dim; j++) {
                
                if ((i == dim || i == 1) || (j == 1 || j == dim)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
