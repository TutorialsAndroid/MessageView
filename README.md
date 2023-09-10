![](https://github.com/TutorialsAndroid/MessageView/blob/master/sample/src/main/res/mipmap-xxhdpi/ic_launcher.png)

# MessageView [![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-MessageView-orange.svg?style=flat)](https://android-arsenal.com/details/1/7580) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/TutorialsAndroid/MessageView) ![Maven Central](https://img.shields.io/maven-central/v/io.github.tutorialsandroid/messageview)


[`Heatic Debate App Download Now`](https://play.google.com/store/apps/details?id=com.asm.heatic)


## And Don't Forget To Follow Me On Instagram

<p align="center">Follow me on instagram to stay up-to-date https://instagram.com/a.masram444

MessageView helps you to create chat message view or a social media post view quickly like a typical chatting application or social media post view
Its a container view, so you can add any type of message or social post such as TextView or any customize TextView, ImageView, etc.

`Library name change from Postui to MessageView.We have removed postui api instead of postui you can use message view api read the below docs.`

**Library Available at Maven Central**

*Please note jitpack version of this library is not maintained consider using maven central*
[![](https://jitpack.io/v/TutorialsAndroid/MessageView.svg)](https://jitpack.io/#TutorialsAndroid/MessageView)

`Latest version of this library is migrated to androidx`

## Features
1. Can have any child inside of it.
2. You can change color of `MessageView` normal and pressed.
3. Adjustable arrow position (top, bottom, left, right)
4. Adjustable arrow gravity (start, end, center)
5. Message view without arrow

### Sample Screen
![](https://github.com/TutorialsAndroid/MessageView/blob/master/art/device-2019-03-17-130446.png)


**See the below demo.This demo shows how the Kinda App is using message view library.**
![](https://github.com/TutorialsAndroid/MessageView/blob/master/sample.jpg)

### Installation with JitPack
*( IMPORTANT NOTE: WE HAVE STOPPED PUSHING LIBRARY TO JITPACK v5.0.19 is outdated now. SEE mavenCentral() below )*

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	         implementation 'com.github.TutorialsAndroid:MessageView:v5.0.19'
	}

### Installation with mavenCentral()
Step 1. Directly add the dependency in application build.gradle file:

    dependencies {
        implementation 'io.github.tutorialsandroid:messageview:6.0.0'
    }    

### Use
1. Include `MessageView` in your xml of adapter view with content inside.

``` xml
<com.developer.messageview.MessageView
	xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:backgroundColor="#88BABABA"
    app:backgroundColorPressed="#FFBABABA"
    app:cornerRadius="3dp" >

    <TextView
        android:id="@+id/text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello" />

        <!-- ... -->

</com.developer.messageview.MessageView>
```

### Customization
Attributes:

``` xml
app:arrowGravity="start|end|center"
app:arrowPosition="right|left|top|bottom"
app:arrowMargin="3dp"
app:contentPadding="10dp"
app:backgroundColor="#88BABABA"
app:backgroundColorPressed="#FFBABABA"
app:cornerRadius="3dp"
app:showArrow="true|false"
```

Description:


- `arrowGravity` controls relative position of arrow. possible values are `start`,`end` and `center`. default is `left`.
- `arrowPosition` controls poition of the arrow outside the box. possible values are `right`,`left`,`top` and `bottom`. default is `left`.
- `arrowMargin` controls margin of arrow. If `arrowPosition` is `left` or `right` it controls top and bottom margin. else it controls left and right margin.
- `contentPadding` adjusts padding of content within the box.
- `backgroundColor` sets background color of `MessageView` in normal mode including arrow.
- `backgroundColorPressed` sets background color of `MessageView` in pressed mode including arrow.
- `cornerRadius` sets corner radius of the box.
- `showArrow` shows / hides arrow from `MessageView`.

----
developed to make programming easy.

by Akshay Sunil Masram (akshaysunilmasram@yahoo.com)

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2019 MessageView

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
