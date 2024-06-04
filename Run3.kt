fun main(args: Array<String>) {
    var x = 1
    var y = 8

//  if
    if(x>y){
        println("X가 큽니다")
    } else if(x<y) {
        println("Y가 큽니다")
    } else {
        println("X와 Y가 같습니다")
    }

    if(x == 1) {
        println("x is 1")
    } else if (x == 2) {
        println("x is 2")
    } else {
        println("x is neither 1,2")
    }
//  when
    when(x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("x is neither 1,2")
    }
//  for
    for(x in 1..10 step 2) {
        println(x)
    }

    var intArray = arrayOf(1,10,101)

    for(x in intArray) {
        println(x)
    }

//  while
//  안에 조건식이 잘못될 경우 무한루프
    var j = 0
    while (j < 5){
        j = j + 1
        println("I can develop")
    }
    println("You can develop")

}