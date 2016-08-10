# MidiDroid
MIDI library for Android, ready to use in Android Studio projects.

### Description
This Midi library is an update of [Android MIDI Library](https://github.com/LeffelMania/android-midi-lib), by Alex Leffelman.
Now it is packaged as a convenient Android Library, instead of the original Eclipse project.

### Usage
**Step 1**. Add [JitPack](https://jitpack.io/) to your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
**Step 2**. Add the dependency in your module build.gradle:
```
dependencies {
        compile 'com.github.pdrogfer:MidiDroid:v1.0'
}
```
Use it and enjoy! 

### License
[Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0)
