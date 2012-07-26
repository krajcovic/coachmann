/**
 * Oznaci/odznaci vsechny checkboxy na zacatku radku v tabulce
 * @param source
 */
function checkUncheckAll(source,form) {
	for ( var i = 0; i < form.elements.length; i++) {
		if (form.elements[i].id == 'checkbox_list') {
			form.elements[i].checked = source.checked;
		}
	}
}
