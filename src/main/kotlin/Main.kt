import org.apache.commons.numbers.primes.Primes.isPrime

fun main() {
    val lengthIncrement = 2

    val diagonalNumbers = mutableListOf(1)
    val diagonalPrimes = mutableListOf<Int>()
    var primeRatio = 1.0 // not true to start off with, but just kicks the loop off
    var sideLength = 1

    while (primeRatio > 0.1) {
        sideLength += lengthIncrement
        (1..4).forEach { _ ->
            val newNumber = diagonalNumbers.last() + sideLength - 1
            diagonalNumbers.add(newNumber)
            if (isPrime(newNumber)) {
                diagonalPrimes.add(newNumber)
            }
        }

        primeRatio = diagonalPrimes.size.toDouble() / diagonalNumbers.size.toDouble()
    }

    println(sideLength)
}
