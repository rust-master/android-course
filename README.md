# Android Course
##### Android course work for students from Lecture 1 to Lecture 16

## Learn More

You can learn more in the [Android](https://developer.android.com/).

You can learn more in the [Firebase](https://firebase.google.com/docs).

### Android Studio

You can download [Android Studio](https://developer.android.com/studio)

#### Android Studio Installation Guide
 
You can install [Android Studio Installation Guide](https://developer.android.com/studio/install)


## Android Lectures

##### Lecture 1

- Introduction – Android OS
- Future of Android | Fuchsia OS
- Why Android
- Feature of Android
- Android Applications
- Requirements to Start
- Environment Setup – Practical
- First Project – Practical
- Project Main Files
<hr>

##### Lecture 2

- UI Layouts
- UI Controls
- Widget
- Widget Attributes
- Making Toasts
- Signup Screen – Practical
<hr>

##### Lecture 3

- Communicating with Intents
- Type of Intents
- Passing Data between Activities
- Relative Layout – Practical
- Intents – Practical
- Attractive Design – Practical
<hr>

##### Lecture 4

- Android – Alert Dialog
- Progress Bar
- Image View
- Radio Button and Check Box
- Splash Screen – Practical

Splash Screen Java Code
```
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
```
<hr>


##### Lecture 5

- WebView
- Input Validation
- Animations
- Screen Orientation
- Count Down App – Practical
<hr>

##### Lecture 6

- Spinner
- ScrollView
- SearchView
- SearchView – Practical
<hr>

##### <a href="https://github.com/Zaryab-Programmer/android-course/blob/master/app/src/main/java/com/mitiapps/loginapplecture1/SharedPrefrenceActivity.java" target="_blank">Lecture 7</a>

- Shared Preferences
- Snackbar
- Custom Fonts
<hr>

##### Lecture 8

- Android Google AdMob
- Banner ads
- Interstitial ads
- Ads Practical
<hr>

##### Lecture 9

- RecyclerView
- Implementation of RecyclerView
<hr>

##### <a href="https://github.com/Zaryab-Programmer/android-course/blob/master/app/src/main/java/com/mitiapps/loginapplecture1/FirebaseAuthActivity.java" target="_blank">Lecture 10</a>

- Firebase
- Firebase Products
- Firebase Authentication
- Firebase Console
- Authentication - Practical

Dependency for Firebase Authentication
```
   implementation 'com.google.firebase:firebase-auth:21.0.1'
```
<hr>

##### Lecture 11

- Firebase Realtime Database
- Structure
- Realtime Database - Practical

Dependency for Firebase Realtime Database
```
   implementation 'com.google.firebase:firebase-database'
```
<hr>

##### Lecture 12

- Read Data from Firebase Database
- Firebase Cloud Messaging
- Realtime Database - Practical

Dependency for Firebase Cloud Messaging
```
   implementation 'com.google.firebase:firebase-messaging'
```
<hr>

##### Lecture 13

- Picasso
- Image Transformations
- Place Holders
- Why use Picasso
- Picasso - Practical

Dependency for Picasso
```
   implementation 'com.squareup.picasso:picasso:(insert latest version)'

```
![image](https://user-images.githubusercontent.com/43227117/121642040-681dcf80-caa9-11eb-899e-ac74aad5a38c.png)
<hr>

##### <a href="https://github.com/Zaryab-Programmer/android-course/blob/master/app/src/main/java/com/mitiapps/loginapplecture1/NewsFeedActivity.java" target="_blank">Lecture 14</a>

- Mini Project - Part 1
- News Feed App
- Picasso
- Custom Layouts
- RecyclerView
- FirebaseRecyclerAdapter
- Model classes
- ViewHolders
- App - Practical

Dependency for FirebaseRecyclerAdapter
```
   implementation 'com.firebaseui:firebase-ui-database:1.2.0'
```
<hr>

##### <a href="https://github.com/Zaryab-Programmer/android-course/tree/master/app/src/main/java/com/mitiapps/loginapplecture1/MiniProject">Lecture 15</a>

- Mini Project - Part 2
- Fragments
- Fragments - Practical
<hr>

##### <a href="https://github.com/Zaryab-Programmer/android-course/blob/master/app/src/main/java/com/mitiapps/loginapplecture1/MiniProject/ui/NewsFeedFragment.java">Lecture 16</a>

- Mini Project - Part 3
- News Feed
- News Feed - Practical
