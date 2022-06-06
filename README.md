![example workflow](https://github.com/WojciechMajewski/Text-Transformer/actions/workflows/ci.yml/badge.svg)
## Text Transformer

### Project description:
Our Text Transformer application will allow you to transform text data (e.g. change case, eliminate duplicates, etc.). The application will be available via GUI as well as remote API, thanks to which it will be possible to integrate it with existing tools.

### Usage methods:
#### Method 1 - Text format:
Submit text to transform and transformation sequence in text format
> curl http[]()://localhost:8080/1st%20method%20uppercase?transforms=upper

#### Method 2 - Mixed format:
Submit text to transform in text format and transformation sequence inside .json or .txt file (interpreted as .json)  
**Remember to navigate to folder with the sample file (in this case, '/TextTrasformerSamples')**  
> curl -X POST -H "Content-Type: application/json" -d @JSONexample.json http[]()://localhost:8080/2nd%20json%20method%20uppercase

#### Method 3 - File format:
Submit text to transform and transformation sequence inside .json or .txt file (interpreted as .json)  
**Remember to navigate to folder with the sample file (in this case, '/TextTrasformerSamples')**  
> curl -X POST -H "Content-Type: application/json" -d @fullJSONexample.txt http[]()://localhost:8080/  

**Remember not to write anything after 'localhost:8080/' !**

### Transformations' shortcuts
- upper (Uppercase)
- lower (Lowercase)
- inverse (Inverse)
- capital (Capitalize)
- numtotext (Numbers to text)
- acrtoword (Acronyms to words)
- wordtoacr (Words to acronyms)
- specsign (Special signs)
- dupeli (Duplicates elimination)
- romtoara (RomanToArabic)
- caesarCipher (CaesarCipher)
- caesarDecipher (CaesarDecipher)
- viewStats (View statistics)