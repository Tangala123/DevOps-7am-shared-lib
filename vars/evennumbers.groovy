def call() {
    (1..50).each { number ->
        if (number % 2 == 0) {
            echo "Even Number: $number"
        }
    }
}
