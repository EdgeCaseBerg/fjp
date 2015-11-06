package com.fjp.models

abstract class MenuItem {}

case class ImageLink(imgSrc: String, href: String) extends MenuItem

case class HtmlItem(html: String) extends MenuItem