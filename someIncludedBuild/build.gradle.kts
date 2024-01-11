import com.github.gmazzo.buildconfig.BuildConfigTask

plugins {
	java
	id("com.github.gmazzo.buildconfig") version "5.3.3"
}

buildConfig {
	buildConfigField(String::class.java, "APP_NAME", project.name)
}

// Uncomment the following, if you want to consistently generate build configs on IDEA sync:
//tasks.maybeCreate("prepareKotlinIdeaImport").dependsOn(tasks.withType<BuildConfigTask>())
