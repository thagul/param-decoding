package param.decoding


import grails.rest.*
import grails.converters.*

class TestController {
	static responseFormats = ['json', 'xml']
	
    def show() {
    	log.info "Showing ID ${params.id}"
    	respond id: params.id
    }
}
