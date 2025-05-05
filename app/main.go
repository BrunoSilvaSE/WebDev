package main

import (
    "fmt"      
    "log"     
    "net/http" 
)

func main() {
    fileserver := http.FileServer(http.Dir("./static"))

    http.Handle("/", fileserver)

    fmt.Printf("port running on http://localhost:4000/\n")

    if err := http.ListenAndServe(":4000", nil); err != nil {
        log.Fatal(err)
	}
}