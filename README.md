# MessageView

MessageView helps you to create chat message view or a social media post view quickly like a typical chatting application or social media post view
Its a container view, so you can add any type of message or social post such as TextView or ImageView, etc.

**Library name change from Postui to messageview.**

**Library Available at JitPack.io**



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
	 implementation 'com.github.TutorialsAndroid:MessageView:v1.0.19'
}
```

### Use
1. Include `MessageView` in your xml of adapter view with content inside.

``` xml
  <com.kinda.messageview.MessageView
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

  </com.kinda.messageview.MessageView>
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
- `arrowMargin` controls margin of arrow. If `cmv_arrowPosition` is `left` or `right` it controls top and bottom margin. else it controls left and right margin.
- `contentPadding` adjusts padding of content within the box.
- `backgroundColor` sets background color of `ChatMessageView` in normal mode including arrow.
- `backgroundColorPressed` sets background color of `ChatMessageView` in pressed mode including arrow.
- `cornerRadius` sets corner radius of the box.
- `showArrow` shows / hides arrow from `PostMessageView`.


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