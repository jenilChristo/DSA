package com.jenil.dsa

import scala.collection.mutable.HashMap

//This problem was recently asked by Google.
//
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//
//Bonus: Can you do this in one pass?
// Will the list be in sorted order
// Will the numbers be repeated

class AddToInteger {

  def willAddToInteger(sum : Int, input: List[Int]): Boolean = {
    if(input.size < 1) return false

       val temp : HashMap[Int, Boolean] = new HashMap[Int, Boolean]()

        var i : Int = 0
        var result : Boolean = false

        while(i <  input.size){
          try{
              val current = input(i)
              val pair = sum - current

              if(temp.contains(pair)){
                result  = true;
              }
              else{
                temp.put(current, true)
              }
            }
            catch {
              case e: Exception => {
                System.out.println(e.getCause.toString())
              }
            }
            i += 1;
        }
        result
      }

}

object Main{
  def main(args: Array[String])={

    val listOfNumbers : List[Int] = List(1,2,3,4,5,6,7,8,9,10,12, 13,21, 25,43);
    val sum = 54;

    val  instance = new AddToInteger()

    println(instance.willAddToInteger(sum = sum, input = listOfNumbers))
  }
}