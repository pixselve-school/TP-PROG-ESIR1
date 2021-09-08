package td2;

public class Article implements SpecifArticle, java.lang.Comparable<SpecifArticle> {
  private String designation;
  private int quantite;
  private double prixHT;
  private static final double tauxTVA = 1.196;

  // constructeur
  public Article(String designation, int quantite, double prixHT) {
    this.designation = designation;
    this.quantite = quantite;
    this.prixHT = prixHT;
  }

 public static void main(String[] args) {
  Article art = new Article (" Lampe ", 10 , 58.50) ;
 System . out . println ( art ) ;

 }

  // accesseurs
  public String designation() {
    return this.designation;
  }

  public int quantite() {
    return this.quantite;
  }

  public double prixHT() {
    return this.prixHT;
  }

  public double prixTTC() {
    return this.prixHT * tauxTVA;
  }

  // ajout / retrait
  public void ajoute(int q) {
    this.quantite += q;
  }

  public void retirer(int q) {
    this.quantite -= q;
  }

 public String toString() {
  return "%s, %s euros (%s en stock)".formatted(this.designation, this.prixHT(), this.quantite);
 }

 /**
  * Compares this object with the specified object for order.  Returns a
  * negative integer, zero, or a positive integer as this object is less
  * than, equal to, or greater than the specified object.
  *
  * <p>The implementor must ensure
  * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
  * for all {@code x} and {@code y}.  (This
  * implies that {@code x.compareTo(y)} must throw an exception iff
  * {@code y.compareTo(x)} throws an exception.)
  *
  * <p>The implementor must also ensure that the relation is transitive:
  * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
  * {@code x.compareTo(z) > 0}.
  *
  * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
  * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
  * all {@code z}.
  *
  * <p>It is strongly recommended, but <i>not</i> strictly required that
  * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
  * class that implements the {@code Comparable} interface and violates
  * this condition should clearly indicate this fact.  The recommended
  * language is "Note: this class has a natural ordering that is
  * inconsistent with equals."
  *
  * <p>In the foregoing description, the notation
  * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
  * <i>signum</i> function, which is defined to return one of {@code -1},
  * {@code 0}, or {@code 1} according to whether the value of
  * <i>expression</i> is negative, zero, or positive, respectively.
  *
  * @param o the object to be compared.
  * @return a negative integer, zero, or a positive integer as this object
  * is less than, equal to, or greater than the specified object.
  * @throws NullPointerException if the specified object is null
  * @throws ClassCastException   if the specified object's type prevents it
  *                              from being compared to this object.
  */
 @Override
 public int compareTo(SpecifArticle o) {
  return this.designation.compareTo(o.designation());
 }
}
