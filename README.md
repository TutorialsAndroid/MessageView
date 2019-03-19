# PostMessageView
PostMessageView helps you to create chat message view or a social media message view quickly like a typical chatting application or social post view
Its a container view, so you can add any type of message or social post such as TextView or any customize TextView, ImageView, etc.

[![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=15)

[![Known Vulnerabilities](https://snyk.io/test/github/TutorialsAndroid/Postui/badge.svg?targetFile=postui%2Fbuild.gradle)](https://snyk.io/test/github/TutorialsAndroid/Postui?targetFile=postui%2Fbuild.gradle)

**Library Available at JitPack.io**

[![](https://jitpack.io/v/TutorialsAndroid/Postui.svg)](https://jitpack.io/#TutorialsAndroid/Postui)

## Important

**Note this library was made in the making for `Kinda` app this library was copied from `ChatMessgaeView` repository on github we made this library because we want to use own library on `Kinda` app.So this library is in development we will monthly
update this library with some changes.**

## Features
1. Can have any child inside of it.
2. You can change color of `PostMessageView` normal and pressed.
3. Adjustable arrow position (top, bottom, left, right)
4. Adjustable arrow gravity (start, end, center)
5. Post view without arrow

### Sample Screen
![](https://github.com/TutorialsAndroid/Postui/blob/master/art/device-2019-03-17-130446.png)

### Installation
add gradle dependency to your dependency list:

Add it in your root build.gradle at the end of repositories:

``` groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
``` groovy
dependencies {
	 implementation 'com.github.TutorialsAndroid:Postui:v0.1'
}
```

### Use
1. Include `PostMessageView` in your xml of adapter view with content inside.

``` xml
<com.kinda.postui.PostMessageView
	xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:cmv_backgroundColor="#88BABABA"
    app:cmv_backgroundColorPressed="#FFBABABA"
    app:cmv_cornerRadius="3dp" >

    <TextView
        android:id="@+id/text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello" />

        <!-- ... -->

</com.kinda.postui.PostMessageView>
```


### Customization
Attributes:

``` xml
app:cmv_arrowGravity="start|end|center"
app:cmv_arrowPosition="right|left|top|bottom"
app:cmv_arrowMargin="3dp"
app:cmv_contentPadding="10dp"
app:cmv_backgroundColor="#88BABABA"
app:cmv_backgroundColorPressed="#FFBABABA"
app:cmv_cornerRadius="3dp"
app:cmv_showArrow="true|false"
```

Description:


- `cmv_arrowGravity` controls relative position of arrow. possible values are `start`,`end` and `center`. default is `left`.
- `cmv_arrowPosition` controls poition of the arrow outside the box. possible values are `right`,`left`,`top` and `bottom`. default is `left`.
- `cmv_arrowMargin` controls margin of arrow. If `cmv_arrowPosition` is `left` or `right` it controls top and bottom margin. else it controls left and right margin.
- `cmv_contentPadding` adjusts padding of content within the box.
- `cmv_backgroundColor` sets background color of `ChatMessageView` in normal mode including arrow.
- `cmv_backgroundColorPressed` sets background color of `ChatMessageView` in pressed mode including arrow.
- `cmv_cornerRadius` sets corner radius of the box.
- `cmv_showArrow` shows / hides arrow from `PostMessageView`.



----
developed to make programming easy.

by Akshay Sunil Masram (akshaysunilmasram@yahoo.com)

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2019 Postui

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


