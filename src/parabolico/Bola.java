/**
 * Clase Bola
 *
 * @author Marco Ramírez A01191344
 * @author Alfredo Altamirano A011911
 * @date 02/25/14
 * @version 1.1
 */

package parabolico;

public class Bola extends Base {

    //Variable contador
    private static int CONT = 0;
    //Variable velocidad en X y Y
    private int velocidadX;
    private int velocidadY;

    /**
     * Metodo constructor que hereda los atributos de la clase
     * <code>Base</code>.
     *
     * @param posX es la <code>posiscion en x</code> del objeto Bola.
     * @param posY es el <code>posiscion en y</code> del objeto Bola.
     * @param anima es la <code>animacion</code> del objeto Bola.
     * @param velocidadX es la <code>velocidad</code> del objeto Bola en X
     * @param velocidadY es la <code>velocidad</code> del objeto Bola en Y
     */
    public Bola(int posX, int posY, Animacion anima, int velocidadX, int velocidadY) {
        super(posX, posY, anima);
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
    }

    /**
     * Metodo <I>getConteo</I> sobrescrito de la clase <code>Bola</code>.<P>
     * En este metodo se regresa el valor del contador CONT.
     *
     * @return  regresa el valor de CONT de tipo <code>int</code>
     */
    public int getConteo() {
        return CONT;
    }

    /**
     * Metodo <I>aumentaConteo</I> sobrescrito de la clase <code>Bola</code>.<P>
     * En este metodo se aumenta el conteo de malos desaparecidos.
     *
     * @void
     */
    public void aumentaConteo() {
        CONT += 2;
    }

    /**
     * Metodo <I>setVelocidad</I> sobrescrito de la clase <code>Bola</code>.<P>
     * En este metodo se modifica la velocidadX con el parametro recibido.
     *
     * @param vel contiene la nueva velocidad de tipo <code>int</code>
     * @void
     */
    public void setVelocidadX(int vel) {
        velocidadX = vel;
    }

     /**
     * Metodo <I>setVelocidad</I> sobrescrito de la clase <code>Bola</code>.<P>
     * En este metodo se modifica la velocidadY con el parametro recibido.
     *
     * @param vel contiene la nueva velocidad de tipo <code>int</code>
     * @void
     */
    public void setVelocidadY(int vel) {
        velocidadY = vel;
    }

    /**
     * Metodo <I>getVelocidad</I> sobrescrito de la clase <code>Bola</code>.<P>
     * En este metodo se regresa el valor de la velocidadX.
     *
     * @return  regresa la velocidad de tipo <code>int</code>
     */
    public int getVelocidadX() {
        return velocidadX;
    }

    /**
     * Metodo <I>getVelocidad</I> sobrescrito de la clase <code>Bola</code>.<P>
     * En este metodo se regresa el valor de la velocidadY.
     *
     * @return  regresa la velocidad de tipo <code>int</code>
     */
    public int getVelocidadY() {
        return velocidadY;
    }
}
