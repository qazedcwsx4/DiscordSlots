name := "wildcatsreturn"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("org.qaze")

resolvers += Resolver.JCenterRepository
libraryDependencies += "net.katsstuff" %% "ackcord"                 % "0.17.1" //For high level API, includes all the other modules
libraryDependencies += "net.katsstuff" %% "ackcord-core"            % "0.17.1" //Low level core API
libraryDependencies += "net.katsstuff" %% "ackcord-commands"        % "0.17.1" //Low to mid level Commands API
libraryDependencies += "net.katsstuff" %% "ackcord-lavaplayer-core" % "0.17.1" //Low level lavaplayer API
libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.5", "org.slf4j" % "slf4j-simple" % "1.7.5")
