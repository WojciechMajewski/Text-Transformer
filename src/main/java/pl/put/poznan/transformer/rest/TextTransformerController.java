package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.TextTransformer;
import pl.put.poznan.transformer.logic.TextTransformerRunner;

import java.util.Arrays;


@RestController
@RequestMapping("/")
public class TextTransformerController {

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

    @RequestMapping(value = "/{text}", method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {

        // log the parameters
        logger.debug("GET-type request:");
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        TextTransformerRunner transformer = new TextTransformerRunner(transforms);
        return transformer.transform(text);
    }

    @RequestMapping(value = "/{text}", method = RequestMethod.POST, produces = "application/json")
    public String postFile(@PathVariable String text,
                           @RequestBody String[] transformations) {

        // log the parameters
        logger.debug("POST-type request:");
        logger.debug(text);
        logger.debug(Arrays.toString(transformations));

        TextTransformerRunner transformer = new TextTransformerRunner(transformations);
        return transformer.transform(text);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public String post(@RequestBody InputData inputData) {

        // log the parameters
        logger.debug("POST-type request:");
        logger.debug(inputData.getText());
        logger.debug(Arrays.toString(inputData.getTransformations()));

        TextTransformerRunner transformer = new TextTransformerRunner(inputData.getTransformations());
        return transformer.transform(inputData.getText());
    }
}


