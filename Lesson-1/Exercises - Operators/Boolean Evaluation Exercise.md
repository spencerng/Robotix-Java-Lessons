|Expression/Condition|`a = true, b = false`|`a = true, b = true`|
| -- | --- | ----- |
| `(a \|\| b) && (!a \|\| !b)` |`true` | `false`|
|`!(a && !b) \|\| (!a && b)`|`false`|`true`|
|`!(a && b)`|`true`|`false`|
