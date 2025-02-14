```groovy
def myMethod(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
        def item = list[i]
        println "Item at index $i: $item"
        if (item == "stop") {
            break // This will exit the for loop
        }
    }
    println "This will print only if 'stop' is not found"
}

myMethod(['a', 'b', 'stop', 'c'])

//Alternative using each loop and a boolean flag
def myMethod2(List<String> list) {
  boolean stop = false
  list.eachWithIndex { item, index ->
    println "Item at index $index: $item"
    if (item == "stop") {
      stop = true
      return
    }
  }
  if(!stop) println "This will print only if 'stop' is not found"
}

myMethod2(['a','b','c'])
myMethod2(['a','b','stop','c']) 
```