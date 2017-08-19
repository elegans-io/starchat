package com.getjenny.starchat.entities

/**
  * Created by angelo on 07/04/17.
  */

import com.getjenny.analyzer.expressions.{Data}

case class AnalyzerEvaluateRequest(analyzer: String,
                                   query: String,
                                   data: Option[Data]
                                  )
