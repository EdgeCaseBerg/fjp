package com.fjp.controllers

import play.api._
import play.api.mvc._

import play.api.libs.concurrent.Execution.Implicits.defaultContext

object SampleController extends Controller {
	def sample = Action {
		Ok(views.html.landing("Title!"))
	}
}