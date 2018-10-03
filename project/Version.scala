/*
 * Copyright (c) 2014 Azavea.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

object Version {
  val geotrellisGdal  = "0.12.0" + Environment.versionSuffix
  val scala           = "2.11.12"
  val geotrellis      = "1.2.0"
  val gdal            = "2.3.0"
  lazy val hadoop     = Environment.hadoopVersion
  lazy val spark      = Environment.sparkVersion
}
