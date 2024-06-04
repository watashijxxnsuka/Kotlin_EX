fun main(args: Array<String>) {
    var i :  Int? = null
    println(i)
    i = 2
    println(i)
// null 은 변수안에 값이 존재하지 않은 상태
// 공백과 0과는 개념이 다르며 변수안에 데이터가 배치되기 전 상태
    val j : Int = 3
    println(j)
//    j = 4
//    println(j)
    println("------------------------")
    // 코틀린의 장점은 뒤에 있는 값으로 타입을 추측해준다.
    var a : Byte = 127
    var b : Short = 32767
    var c  = 21_0000_0000
    var d : Long = 22_0000_0000
    var e = 3.14f
    var f : Float = 3.1234567f

    var g : Char = 'G'
    var h  = true
    var k : String = "i"
    var array : Array<String> = arrayOf("철수", "민수", "서준")


    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(k)
    println(array) // 주소값이 나오게된다.
}