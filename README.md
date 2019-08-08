# ViewGardiumLeviosa
Makes a view fluctuate.

<img src="https://github.com/paolorotolo/ViewGardiumLeviosa/blob/master/art/viewgardiumleviosa.gif" width="400">

## Import
1. **Add the JitPack repository to your build file**

 Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2. **Add the dependency**

```gradle
	dependencies {
	        implementation 'com.github.paolorotolo:viewgardiumleviosa:1.0.0'
	}
```

## Usage
ViewGardiumLeviosa adds an extension method to your Views.

You can make the view fluctuate with:
```kotlin
view.startFluctuate()
```

If you want to customize the animation, you can specify the max delta and the duration of one animcaiton cycle:
```kotlin
val fluctuateDelta = -50
val fluctuateDuration = 500

view.startFluctuate(fluctuateDelta, fluctuateDuration)
```

Finally, to stop the animation, call:
```kotlin
view.stopFluctuate()
```
