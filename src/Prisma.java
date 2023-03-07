public class Prisma {

    /**
     * Propiedades de la prisma que fue introducido por el usuario
     */
    float baseTriangulo;
    float alturaPrisma;

    /**
     * Constructor sin parametro para inicializar el objeto
     */

    public Prisma() {
    }

    /**
     * Constructor con parametro
     * @param baseTriangulo base triangulo que fue introducido por usuario
     * @param alturaPrisma altura prisma que fue introducido por usuario
     */

    public Prisma(float baseTriangulo, float alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Obtener el base de triangulo
     * @return devolver el valor del base triangulo
     */

    public float getBaseTriangulo() {
        return baseTriangulo;
    }

    /**
     * Poner el base de triangulo
     * @param baseTriangulo poner el valor del base triangulo
     */

    public void setBaseTriangulo(float baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    /**
     * Obtener la altura de la prisma
     * @return devolver el valor de la altura prisma
     */

    public float getAlturaPrisma() {
        return alturaPrisma;
    }

    /**
     * Poner la altura de la prisma
     * @param alturaPrisma poner la altura prisma
     */

    public void setAlturaPrisma(float alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Obtener la altura de triangulo
     * @return devolver la altura triangulo
     */

    public float alturaTriangulo() {
        return ((float)Math.sqrt(3))*baseTriangulo/2f;
    }

    /**
     * Obtener la area de base
     * @return devolver el valor de la area base
     */

    public float areaBase() {
        return (baseTriangulo*alturaTriangulo())/2f;
    }

    /**
     * Obtener el perimetro
     * @return devolver el valor del perimetro
     */

    public float perimetro() {
        return baseTriangulo*3;
    }

    /**
     * Obtener la area lateral
     * @return devolver el valor de la area lateral
     */

    public float areaLateral() {
        return perimetro()*alturaPrisma;
    }

    /**
     * Obtener la area total
     * @return devolver el valor de la area total
     */

    public float areaTotal() {
        return (2f*areaBase())+areaLateral();
    }

    /**
     * Obtener una string con informacion de la prisma calculado
     * @return devolver una string con la informacion de la prisma despues de calculado
     */

    @Override
    public String toString() {
        return "Base: " + baseTriangulo + '\n' + "Altura: " + alturaPrisma + '\n' + "Area total: " + areaTotal();
    }
}
