# DonutScript :donut:

![image](images/dstitle.png)

* [What is?](https://github.com/flashcontent/donutscript#what-is)
* [Power](https://github.com/flashcontent/donutscript#power)
	* [Java](https://github.com/flashcontent/donutscript#java)
	* [Simple](https://github.com/flashcontent/donutscript#simple)
	* [Graphics and Games](https://github.com/flashcontent/donutscript#graphics-and-games)
	* [Web development](https://github.com/flashcontent/donutscript#web-development)
	* [GUI](https://github.com/flashcontent/donutscript#gui)
* [Learning](https://github.com/flashcontent/donutscript#learning)

## What is?

DonutScript is a scripting programming language used to make games and applications that can compile to Java. Uses ANTLR4 for language generation.
It is used in FlashContent projects, like [Actbit](https://github.com/flashcontent/actbit).

## Power 
DonutScript have much power than other languages, like:

### Java
DonutScript uses Java, a strong programming language that is (really) easy to learn.
With Java, DonutScript can create games, web applications, GUI, etc...

### Simple
DonutScript is based on CoffeeScript, MoonScript and Ruby. It is very simple to learn. Here's a hello world app in DonutScript:
``` lua
require donut

fun main():
   println("Hello World!\n")
end
```

### Graphics and Games
DonutScript have embed graphics with LWJGL, so you can create any graphical application with DonutScript.
You can create too games with DonutScript. Here's a basic example:
``` lua
require donut
require donut.graphics

fun main():
   square = new gl.Square(0, 0,"green")
   if gl.keyDown("space"):
      square.color = "yellow"
end
``` 

### Web development
DonutScript have the CakeCandy (development) framework. It is a web application framework for DonutScript. Here's a example:
DonutScript:
``` lua
require donut
require cake

class Main
  fun main() extend cake.App:
      cake.write("Hello World!");
  end
end
``` 

## Learning
You can learn DonutScript at the [DonutScript Wiki](https://github.com/flashcontent/donutscript/wiki).