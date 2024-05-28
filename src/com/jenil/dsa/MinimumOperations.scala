package com.jenil.dsa

/*
Given an array, find the minimum number of operations needed to make each element the smallest in the array

An operation can be to increase any number in the array by one.
 */
class MinimumOperations {

   def getMinimumOperationsToMakeSmallest(arr: Array[Int]): Array[Long] = {
     arr.map{
         element => arr.filter(_ < element).sum
    }
   }

}
object MinimumOperations{
   def main(args: Array[String])={
      val minops = new MinimumOperations()

      val result: Array[Long] = minops.getMinimumOperationsToMakeSmallest(Array(5,4,3,2,1))

      result.foreach(el => println(el))
   }
}
