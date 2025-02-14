# Groovy eachWithIndex Return Behavior

This example demonstrates a common pitfall when using the `eachWithIndex` method in Groovy.  The `return` statement inside the closure only exits the `eachWithIndex` loop, not the enclosing method.  This can lead to unexpected results.

The `bug.groovy` file contains the buggy code, and `bugSolution.groovy` provides the corrected version.

## How to Reproduce
1. Save the `bug.groovy` code.
2. Run the script using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe that the message "This will always print" appears, even though the loop encounters the 'stop' element.

## Solution
The solution involves using a more appropriate control flow mechanism, such as a `break` statement within a loop.