fun main(args: Array<String>) {

    print("First number:")
    val myfnum =Integer.valueOf(readLine()).toDouble()

    print("Second number:")
    val mysnum =Integer.valueOf(readLine()).toDouble()

    print("Operator:")
    var operator= readLine()

    print("Number")
    var mynumber= Double

    if (operator == "+"){
        var ans= myfnum+mysnum
        print("Answer="+ans)
    }else if (operator == "*"){
        var ans= myfnum*mysnum
    print("Answer="+ans)
    }else if (operator == "-"){
        var ans= myfnum-mysnum
        print("Answer="+ans)
    }else if (operator == "/"){
        var ans= myfnum/mysnum
        print("Answer="+ans)
    } else{
        print("Invalid operator")
    }
    
}