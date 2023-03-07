import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /*
        Clase anonima implementar el interface comparator y reescribir su metodo compare, treeset se trata de un estructura de datos red black tree,
        se va a comparar desde el enlace de raiz, si el resultado de comparacion es negativo se va a comparar o guardar al subenlace de izquierda,
        si es positivo pues se guardar o comparar en el subenlace derecha, y tiene una serie de regla para hacer el equilibrio del arbol, mediante esta algoritmo
        por defecto se ordena desde menor a mayor con codigo de la tabla ascii, y podemos utilizar el interface comparator o comparable con su metodo
        reescribido para cambiar su regla de ordenacion.
        */

        /*
        TreeSet<Prisma> ts = new TreeSet<>(new Comparator<Prisma>() {
            @Override
            public int compare(Prisma o1, Prisma o2) {
                return o1.areaTotal() > o2.areaTotal()? -1 : 1;
            }
        });
        */

        /*
        Simplificado con lambda expression: puede quitar el nombre del metodo, el tipo de dato en dentro de argumento, comentario de reescribir,
        poner el simbolo de expresion lambda -> para expresar relacion entre argumento y instruccion.
        */

        TreeSet<Prisma> ts = new TreeSet<>((Prisma o1, Prisma o2) -> o1.areaTotal() > o2.areaTotal()? -1 : 1);

        //metodo de generar prisma

        setPrisma(ts);

        //metodo de imprimir resultado

        printResult(ts);

    }

    /**
     * metodo para generar prisma con valor aleatoria y se guarda al treeset
     * @param ts lista de treeset
     */

    public static void setPrisma(TreeSet<Prisma> ts){

        Prisma prisma1 = new Prisma((float)(Math.random()*100+1),(float)(Math.random()*100+1));
        Prisma prisma2 = new Prisma((float)(Math.random()*100+1),(float)(Math.random()*100+1));
        Prisma prisma3 = new Prisma((float)(Math.random()*100+1),(float)(Math.random()*100+1));

        Collections.addAll(ts,prisma1,prisma2,prisma3);

    }

    /**
     * metodo para imprimir resultado
     * @param ts lista de treeset
     */

    public static void printResult(TreeSet<Prisma> ts){
        ts.forEach(prisma -> System.out.println(prisma+"\n"+"--------------------------------------"));
    }
}