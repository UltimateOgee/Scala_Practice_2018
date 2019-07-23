package cs2.util

class Complex (private var r:Double, private var i:Double) {
  def real():Double = r
	def imag():Double = i
	
	def + (other:Complex):Complex = {new Complex(this.r + other.r, this.i + other.i)}
	def - (other:Complex):Complex = {new Complex(this.r - other.r, this.i - other.i)}
	
	def * (other:Complex):Complex = {new Complex((this.r*other.r - this.i*other.i), (this.i*other.r + this.r*other.i))}
	def / (other:Complex):Complex = {new Complex(((this.r*other.r + this.i*other.i)/(other.r*other.r + other.i*other.i)), ((this.i*other.r - this.r*other.i)/(other.r*other.r + other.i*other.i)))}
	
	def conjugate():Complex = {new Complex(this.r, -1*this.i)}	
	
	//I created this method for testing:
	def printString() {
	  println(this.real() + " + " + this.imag() + "i")
	}
}
	
object hw0 {
	/** Use this main function to create a tester for your Complex number class
	 *  Be sure to test construction of Complex objects, calling each of the methods
	 *  defined above, and the use of "corner case" values
	 */
	def main(args:Array[String]) {
	  //Test of constructing complex objects:
	  var c = new Complex(2, 1)
	  var c1 = new Complex(3, 2)
	  
	  println("c then c1:") //space
	  //test if the instances of Complex exist:
	  c.printString()
	  c1.printString()
	  
	  println("Addition and Subtraction:") //space
	  
	  //test addition and subtraction:
	  (c+c1).printString()
	  (c-c1).printString()
	  
	  println("Multiplication and Division") //space
	  
	  //test multiplication and division
	  (c*c1).printString()
	  (c/c1).printString()
	  
	  println("Conjugate of c then c1:") //space
	  //test conjugate
	  (c.conjugate()).printString()
	  (c1.conjugate()).printString()
	  
	  //all methods were tested and compute properly 
	  /* notes */
	  /* Although all of the methods function properly allowing users to operate on complex numbers,
	   * in the future if this were implemented somewhere, the + operator in between the real and imag
	   * numbers would likely change sign based on what the imaginary number's value is. This would look
	   * better from the users pov because instead of reading something like 1 + -1i they would read 
	   * 1 - 1i which is the more traditional format for reading these numbers.
	   * 
	   * For the division operator method, the results in the console show long decimal numbers
	   * represented by doubles. Instead of those numbers, a user (mathematicians especially) would
	   * probably like to see mixed numbers instead of decimals. This would also be added if this Complex
	   * class were to be used for a real program in the future.
	   */
	}
}
