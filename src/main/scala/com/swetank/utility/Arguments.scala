package com.swetank.utility

import com.swetank.model.ArgumentsCaseClass

object Arguments {
  def getArguments(args: Array[String]): ArgumentsCaseClass = {
    ArgumentsCaseClass(
      companyName = args(0),
      userName = args(1),
      password = args(2),
      jobType = args(3)
    )
  }

}
