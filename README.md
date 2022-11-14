# Kotlin Flows

## Keywords And Definitions

- **Flow:** is a type that can emit multiple values sequentially, as opposed to suspend functions
  that return only a single value. For example, you can use a flow to receive live updates from a
  database.
- **Reactive Programing:** is a declarative programming paradigm concerned with continuous *streams
  of data* and observing or reacting to change within the data stream.
- **Data Streams:** are comprised of three entities to create a sequential flow of data over time.
    - A **producer** produces data that is added to the stream. Thanks to coroutines, flows can also
      produce data asynchronously.
    - **(Optional) Intermediaries** can modify each value emitted into the stream or the stream
      itself.
    - A **consumer** consumes the values from the stream.
- **Flow Builders:** are the tools you use to build your flows. Examples: flow, asFlow, flowOf, ect.
- **Flow Operators:** are used to transform flows. There are two types of flow operators:
  ***intermediate*** and ***terminal***.
    - **Intermediate operators** are used for modifying the data flow between the producer and the
      consumer in order to meet the requirements of the following layer. Examples: map, reduce,
      fold, ect.
    - **Terminal operators** are the operators that actually start the flow by connecting the flow
      builder, operators with the collector. Example: fist, last, collect, collectLatest, ect.

> When you apply a terminal operator, that flow is then created and starts emitting values.
> Intermediate operators just execute a chain of commands in a lazy fashion.


