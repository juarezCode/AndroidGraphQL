# AndroidGraphQL
Android app that show a list of available launches, shows their details, and they can be booked and canceled.

Introduction
-----------------
This app is based in [Apollo Kotlin documentacion](https://www.apollographql.com/docs/kotlin/)
This app is built with the following technologies:

* [Apollo Kotlin](https://github.com/apollographql/apollo-kotlin), (formerly Apollo Android) is a GraphQL client that generates Kotlin and Java models from GraphQL queries.

  Apollo Kotlin executes queries and mutations against a GraphQL server and returns results as query-specific Kotlin types. This means you don't have to deal with parsing JSON, or passing around Maps and making clients cast values to the right type manually. You also don't have to write model types yourself, because these are generated from the GraphQL definitions your UI uses.

  Because generated types are query-specific, you can only access data that you actually specify as part of a query. If you don't ask for a particular field in a query,  you can't access the corresponding property on the returned data structure.

  This library is designed primarily with Android in mind, but you can use it in any Java/Kotlin app, including multiplatform.
  
* [Coil](https://coil-kt.github.io/coil/), An image loading library for Android backed by Kotlin Coroutines

* [Kotlin Flows](https://developer.android.com/kotlin/flow), In coroutines a flow is a type that can emit multiple values sequentially, as opposed to suspend functions that return only a single value.

* [Coroutines](https://developer.android.com/kotlin/coroutines), A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously.
