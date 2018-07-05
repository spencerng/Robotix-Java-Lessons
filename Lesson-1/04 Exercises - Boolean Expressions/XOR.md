Below is a table of the XOR operator:

|a|b|`a XOR b`|
| -- | --- | -------| 
|false |false|`false`|
|false|true|`true`|
|true|false|`true`|
|true|true|`false`|

Using this, we can write

    boolean XOR = (!a && b) || (a && !b);