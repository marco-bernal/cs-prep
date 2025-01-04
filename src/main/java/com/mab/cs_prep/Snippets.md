### Useful Collections and Streams snippets 

* Map values to int[] Array.
``` 
return map.values()
          .stream()
          .mapToInt(Integer::intValue)
          .toArray();
```

* Return keys as an int[] array, that their value is greater than 1.
``` 
return resultMap.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .mapToInt(Map.Entry::getKey)
                .toArray();
```

* If a key already exist update its value. Otherwise, add it to the map.
``` 
if (words.containsKey(word)) {
    words.put(word, words.get(word) + 1);
}
else {
    words.put(word, 1);
}
```

* Extracts the key of an entry based on the max value.
``` 
return words.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
```

* Return the max value from an int[] array as int or Integer. 
``` 
return Arrays.stream(values)
             .reduce(Integer::max)
             .orElse(-1);
```
* Concatenates 2 String[] arrays into one.
``` 
return Stream.concat(Arrays.stream(input1), Arrays.stream(input2))
             .toArray(String[]::new);
```

### Useful Char and String snippets 
TODO