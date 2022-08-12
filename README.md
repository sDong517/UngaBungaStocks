
https://user-images.githubusercontent.com/77254935/184424655-6eb449f3-5e97-4601-aa91-66dc3f6d9060.mp4

# UngaBungaStocks

UngaBungaStocks is a stock finder app used to showcase the [Clean](https://medium.com/android-dev-hacks/detailed-guide-on-android-clean-architecture-9eab262a9011) architectural guidelines with [SOLID](https://medium.com/android-news/android-development-the-solid-principles-3b5779b105d2) design principle by separating the application into *data*, *domain*, and *presentation*.
This allows for clean code visually and physically as the separation of business logic allows for more flexibility. 

It also utilizes dependency injection with [**Dagger-Hilt**](https://dagger.dev/hilt/), networking with [**Retrofit**](https://square.github.io/retrofit/), and local caching with [**Room**](https://developer.android.com/jetpack/androidx/releases/room). 
The views are also built via [**Jetpack Compose**](https://developer.android.com/jetpack/compose), which streamlines some aspects of the otherwise problematic appproach of custom views. 

The API in question is from [Alpha Vantage](https://www.alphavantage.co/documentation/#), which provides a free api upon request limited to about 5 calls per minute. As such, the API key is not hidden
and allows anyone who forks this to demonstrate these libraries and principles without having to create an account. 
